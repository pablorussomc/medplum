/*
 * Generated by @medplum/generator
 * Do not edit manually.
 */

import { PoolClient } from 'pg';

export async function run(client: PoolClient): Promise<void> {
  await client.query(
    'CREATE INDEX CONCURRENTLY IF NOT EXISTS "Coding_Property_coding_idx" ON "Coding_Property" (coding)'
  );
}